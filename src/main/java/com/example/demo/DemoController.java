package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/entitlement")
public class DemoController {
	
	@Autowired
	EntitlementRepositery entitlementRepositery;

	@GetMapping("/sample")
    String sample() {
        StringBuilder mlIntro = new StringBuilder();
        mlIntro.append("<html><body>");
        mlIntro.append("<h1>Introduction to Machine Learning</h1>");

        mlIntro.append("<h2>What is Machine Learning?</h2>");
        mlIntro.append("<p>Machine Learning is a subset of artificial intelligence (AI) that allows systems to learn and improve from experience without being explicitly programmed.</p>");

        mlIntro.append("<h2>Types of Machine Learning</h2>");
        mlIntro.append("<ul>");
        mlIntro.append("<li><b>Supervised Learning:</b> Training data includes both input and desired output.</li>");
        mlIntro.append("<li><b>Unsupervised Learning:</b> Algorithms are trained on data without labeled responses.</li>");
        mlIntro.append("<li><b>Reinforcement Learning:</b> Agents learn to make decisions based on rewards and punishments.</li>");
        mlIntro.append("</ul>");

        mlIntro.append("<h2>Applications of Machine Learning</h2>");
        mlIntro.append("<ul>");
        mlIntro.append("<li><b>Natural Language Processing (NLP):</b> Language translation, sentiment analysis, chatbots.</li>");
        mlIntro.append("<li><b>Computer Vision:</b> Image and video recognition, object detection.</li>");
        mlIntro.append("<li><b>Recommendation Systems:</b> Personalized recommendations in e-commerce and streaming platforms.</li>");
        mlIntro.append("</ul>");

        mlIntro.append("<h2>Popular Machine Learning Libraries</h2>");
        mlIntro.append("<ul>");
        mlIntro.append("<li><b>TensorFlow:</b> Developed by Google for deep learning applications.</li>");
        mlIntro.append("<li><b>Scikit-learn:</b> Simple and efficient tools for data mining and data analysis.</li>");
        mlIntro.append("<li><b>PyTorch:</b> Deep learning framework primarily developed by Facebook's AI Research lab.</li>");
        mlIntro.append("</ul>");

        mlIntro.append("</body></html>");
        return mlIntro.toString();
    }
	
	@PostMapping("/add")
	EntitlementEntity add(@RequestBody EntitlementEntity entitlementEntity ) {
		return entitlementRepositery.save(entitlementEntity);
	}
	@GetMapping("/getAll")
	List<EntitlementEntity> getAll() {
		return entitlementRepositery.findAll();
	}
}
