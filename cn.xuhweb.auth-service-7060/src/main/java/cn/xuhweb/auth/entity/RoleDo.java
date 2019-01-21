package cn.xuhweb.auth.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
 * 用户角色
 *
 * @author xuh@fitme.ai
 * @date 2019/1/17 16:08
 */
@Data
@Entity
public class RoleDo implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;


    @Override
    public String getAuthority() {
        return name;
    }
}
