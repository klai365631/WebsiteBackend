package team.skyprojava.websitebackend.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import team.skyprojava.websitebackend.dto.CommentDto;
import team.skyprojava.websitebackend.dto.ResponseWrapperCommentDto;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/ads")
@RequiredArgsConstructor
public class CommentController {

    @GetMapping("/{id}/comments")
    public ResponseEntity<ResponseWrapperCommentDto> getComments(@PathVariable int id) {
        System.out.println("Проверка отклика getComments");
        return ResponseEntity.ok(new ResponseWrapperCommentDto());
    }

    @PostMapping("/{id}/comments")
    public ResponseEntity<CommentDto> addComment(@PathVariable int id, @RequestBody CommentDto commentDto) {
        System.out.println("Проверка отклика addComments");
        return ResponseEntity.ok(new CommentDto());
    }


    @DeleteMapping("/{adId}/comments/{commentId}")
    public ResponseEntity<Void> deleteComment(@PathVariable int adId, @PathVariable int commentId) {
        System.out.println("Проверка отклика  deleteComments_id");
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{adId}/comments/{commentId}")
    public ResponseEntity<CommentDto> updateComment(@PathVariable int adId, @PathVariable int commentId, @RequestBody CommentDto commentDto) {
        System.out.println("Проверка отклика  updateComment_id");
        return ResponseEntity.ok(new CommentDto());
    }
}
