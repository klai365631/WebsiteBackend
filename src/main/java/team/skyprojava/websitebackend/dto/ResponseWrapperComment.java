package team.skyprojava.websitebackend.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;

@Data
public class ResponseWrapperComment {
    private int count;
    private Collection<Comment> results = new ArrayList<>();
}
