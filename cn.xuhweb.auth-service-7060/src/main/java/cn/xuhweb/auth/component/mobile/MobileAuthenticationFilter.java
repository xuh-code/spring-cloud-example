package cn.xuhweb.auth.component.mobile;

import cn.xuhweb.common.constant.SecurityConstants;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.HttpMethod;
import java.io.IOException;

/**
 * 手机号登录验证filter
 * Created by xuh
 * DATE 2018/12/16 23:43.
 * version 1.0
 */
public class MobileAuthenticationFilter extends AbstractAuthenticationProcessingFilter {

    public static final String SPRING_SECURITY_FORM_MOBILE_KEY = "mobile";

    private String mobileParameter = SPRING_SECURITY_FORM_MOBILE_KEY;
    private boolean postOnly = true;

    public MobileAuthenticationFilter() {
        super(new AntPathRequestMatcher(SecurityConstants.MOBILE_TOKEN_URL, "POST"));
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException, IOException, ServletException {
        if (postOnly && !request.getMethod().equals(HttpMethod.POST))
            throw new AuthenticationServiceException("Authentication method not supported: " + request.getMethod());

        String mobile = obtainMobile(request);

        if (mobile == null)
            mobile = "";

        mobile = mobile.trim();
        MobileAuthenticationToken mobileAuthenticationToken = new MobileAuthenticationToken(mobile);
        setDetails(request, mobileAuthenticationToken);
        return this.getAuthenticationManager().authenticate(mobileAuthenticationToken);
    }

    protected String obtainMobile(HttpServletRequest request){
        return request.getParameter(mobileParameter);
    }

    protected void setDetails(HttpServletRequest request, MobileAuthenticationToken authRequest){
        authRequest.setDetails(authenticationDetailsSource.buildDetails(request));
    }

    public String getMobileParameter() {
        return mobileParameter;
    }

    public void setMobileParameter(String mobileParameter) {
        this.mobileParameter = mobileParameter;
    }

    public boolean isPostOnly() {
        return postOnly;
    }

    public void setPostOnly(boolean postOnly) {
        this.postOnly = postOnly;
    }
}
