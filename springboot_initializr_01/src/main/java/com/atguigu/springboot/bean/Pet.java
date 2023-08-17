package com.atguigu.springboot.bean;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Pet {
    private String name;
    private Integer weight;

}
