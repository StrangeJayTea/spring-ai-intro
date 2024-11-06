package guru.springframework.springaiintro.services;

import guru.springframework.springaiintro.model.Answer;
import guru.springframework.springaiintro.model.Question;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/** The OpenAI credentials won't authenticate me on my work laptop.  Using this
 * for now to keep going through the tutorial.
 */
@Primary
@Service
public class FakeOpenAIServiceImpl implements OpenAIService {

    @Override
    public Answer getAnswer(final Question question) {
        return new Answer("do this for now");
    }
}
