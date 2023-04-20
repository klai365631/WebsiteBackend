package team.skyprojava.websitebackend.service;

import team.skyprojava.websitebackend.dto.CommentDto;

import java.util.List;

public interface CommentService {

    List<CommentDto> getAdsComments(int id);

}
