package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.model.Image;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    //The method calls the addComment() method in the Repository and passes the comment to be persisted in the database
    public void addComment(Comment comment) {
        commentRepository.addComment(comment);
    }

    //Call the getAllImages() method in the Repository and obtain a List of all the images in the database
    public List<Comment> getCommentsByImage(Image image) {
        return commentRepository.getCommentsByImage(image);
    }
}
