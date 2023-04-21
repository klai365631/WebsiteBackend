package team.skyprojava.websitebackend.service;

import team.skyprojava.websitebackend.dto.CommentDto;
import team.skyprojava.websitebackend.dto.ResponseWrapperCommentDto;

import java.util.List;

public interface CommentService {

    ResponseWrapperCommentDto getAdsComments(long id);

}
