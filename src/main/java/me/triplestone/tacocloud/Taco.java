package me.triplestone.tacocloud;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco{
    //与design.html中的名字为name的input对应，并对其进行输入限制
    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;

    @Size(min=1, message="You must choose at least 1 ingredient!")
    private List<String> ingredient;
}