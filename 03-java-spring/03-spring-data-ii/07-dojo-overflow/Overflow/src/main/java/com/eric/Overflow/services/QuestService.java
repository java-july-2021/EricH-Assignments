package com.eric.Overflow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.eric.Overflow.models.Answer;
import com.eric.Overflow.models.Question;
import com.eric.Overflow.models.Tag;
import com.eric.Overflow.repositories.aRepo;
import com.eric.Overflow.repositories.qRepo;
import com.eric.Overflow.repositories.tRepo;

@Service
public class QuestService {
	private final aRepo aRepo;
	private final qRepo qRepo;
	private final tRepo tRepo;
	
	
	public QuestService(aRepo aRepo, qRepo qRepo, tRepo tRepo) {
		this.aRepo = aRepo;
		this.qRepo = qRepo;
		this.tRepo = tRepo;
	}
	
	public ArrayList<Tag> splitTags(String tags) {
		ArrayList<Tag> tagsForQ = new ArrayList<Tag>();
		String[] tagsToProcess = tags.split(", ");
		for(String s : tagsToProcess) {
			if(this.tRepo.existsBySubject(s)) {
				Tag tagToAdd = this.getTag(s);
				tagsForQ.add(tagToAdd);
			}
			else {
				Tag newTag = new Tag();
				newTag.setSubject(s);
				this.tRepo.save(newTag);
				tagsForQ.add(this.getTag(s));
			}
		}
		return tagsForQ;
		
	}
	
	public List<Question> allQuestions(){
		return qRepo.findAll();
	}
	public List<Answer> allAnswers(){
		return aRepo.findAll();
	}
	public List<Tag> allTags(){
		return tRepo.findAll();
	}
	public Question newQuestion(Question question) {
		return qRepo.save(question);
	}
	public Answer createAnswer(Answer answer) {
		return aRepo.save(answer);
	}
	public Question createQuestion(Question question) {
		question.setTags(this.splitTags(question.getTagsFrontEnd()));
		return this.qRepo.save(question);
	}
	public Question getQuestion(Long id) {
		return qRepo.findById(id).orElse(null);
	}
	public Answer getAnswer(Long id) {
		return aRepo.findById(id).orElse(null);
	}
	public Tag getTag(String subject) {
		return tRepo.findBySubject(subject);
	}

}
