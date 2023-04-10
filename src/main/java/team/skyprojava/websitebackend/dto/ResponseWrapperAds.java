package team.skyprojava.websitebackend.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;

@Data
public class ResponseWrapperAds {
    private int count;
    private Collection<Ads> results = new ArrayList<>();
}
