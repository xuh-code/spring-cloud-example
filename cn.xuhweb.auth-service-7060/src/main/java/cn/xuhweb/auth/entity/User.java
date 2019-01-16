//package cn.xuhweb.auth.entity;
//
//import com.baomidou.mybatisplus.annotation.TableField;
//import com.baomidou.mybatisplus.annotation.TableId;
//import lombok.Data;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import javax.persistence.Table;
//import java.util.List;
//
///**
// * @author xuh@fitme.ai
// * @date 2019/1/15 18:21
// */
//@Data
//@Table(name = "user")
//public class User implements UserDetails {
//    @TableId
//    private String id;
//    private String username;
//    private String email;
//    @TableField("isEnable")
//    private Boolean isEnable;
//    @TableField("isExpired")
//    private Boolean isExpired;
//    @TableField("isLocked")
//    private Boolean isLocked;
//    private String password;
//    private String gender;
//
//    @TableField(exist = false)
//    private List<GrantedAuthority> authorities;
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return this.isLocked;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return this.isExpired;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return this.isEnable;
//    }
//
//    @Override
//    public List<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//
//}
