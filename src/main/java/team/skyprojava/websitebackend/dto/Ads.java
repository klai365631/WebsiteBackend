package team.skyprojava.websitebackend.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;

@Data
public class Ads {
    private int author;
    private Collection<String> image = new ArrayList<>();
    private int pk;
    private int price;
    private String title;
}
