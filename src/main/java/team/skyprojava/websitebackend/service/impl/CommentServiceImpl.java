package team.skyprojava.websitebackend.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import team.skyprojava.websitebackend.dto.CommentDto;
import team.skyprojava.websitebackend.service.CommentService;

import java.util.List;

public class CommentServiceImpl implements CommentService {

    Logger logger = LoggerFactory.getLogger(CommentService.class);
    @Override
    public List<CommentDto> getAdsComments(int id) {
        logger.info("Was invoked method for get ads comment by id");
        List<AdsComment> commentList = adsCommentRepository.findAllByAdsId(id);
        return adsCommentMapper.toDto(commentList);
    }


}
