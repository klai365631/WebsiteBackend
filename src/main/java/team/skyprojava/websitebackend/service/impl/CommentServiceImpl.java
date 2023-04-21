package team.skyprojava.websitebackend.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import team.skyprojava.websitebackend.dto.CommentDto;
import team.skyprojava.websitebackend.dto.ResponseWrapperCommentDto;
import team.skyprojava.websitebackend.repository.AdsCommentRepository;
import team.skyprojava.websitebackend.service.CommentService;

import java.util.List;

public class CommentServiceImpl implements CommentService {
    Logger logger = LoggerFactory.getLogger(CommentService.class);
    AdsCommentRepository adsCommentRepository;
    @Override
    public ResponseWrapperCommentDto getAdsComments(long id) {
        logger.info("Was invoked method for get ads comment by id");
        return adsCommentMapper.toDto(adsCommentRepository.findAllByAdsId(id));
    }


}
