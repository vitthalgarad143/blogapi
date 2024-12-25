/**
 * Created By Vitthal Garad
 * Date:05-12-2024
 * Time:17:47
 * Project Name:blog_api
 */


package com.vitthal.blog_api.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private int id;
    private String name;
    private String email;
    private String password;
    private String about;
}
