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
    mlIntro.append("<h1>Introduction to Machine Learning!!!!!!!!!!</h1>");

    mlIntro.append("<h2>What is Machine Learning?</h2>");
    mlIntro.append("<p>Machine Learning is a subset of artificial intelligence (AI) that allows systems to learn and improve from experience without being explicitly programmed. It involves algorithms that learn patterns from data and make predictions or decisions based on it.</p>");

    mlIntro.append("<h2>Types of Machine Learning</h2>");
    mlIntro.append("<ul>");
    mlIntro.append("<li><b>Supervised Learning:</b> Training data includes both input and desired output. Algorithms learn to map inputs to outputs. Examples include classification and regression.</li>");
    mlIntro.append("<li><b>Unsupervised Learning:</b> Algorithms are trained on data without labeled responses. They identify patterns or groupings within the data. Examples include clustering and association.</li>");
    mlIntro.append("<li><b>Reinforcement Learning:</b> Agents learn to make decisions based on rewards and punishments. It’s often used in robotics and game playing.</li>");
    mlIntro.append("</ul>");

    mlIntro.append("<h2>Applications of Machine Learning</h2>");
    mlIntro.append("<ul>");
    mlIntro.append("<li><b>Natural Language Processing (NLP):</b> Language translation, sentiment analysis, chatbots.</li>");
    mlIntro.append("<li><b>Computer Vision:</b> Image and video recognition, object detection.</li>");
    mlIntro.append("<li><b>Recommendation Systems:</b> Personalized recommendations in e-commerce and streaming platforms.</li>");
    mlIntro.append("<li><b>Predictive Analytics:</b> Forecasting sales, stock prices, or trends based on historical data.</li>");
    mlIntro.append("<li><b>Healthcare:</b> Disease prediction, personalized treatment plans, and drug discovery.</li>");
    mlIntro.append("<li><b>Autonomous Vehicles:</b> Self-driving cars and drones using computer vision and sensor data.</li>");
    mlIntro.append("</ul>");

    mlIntro.append("<h2>Popular Machine Learning Libraries</h2>");
    mlIntro.append("<ul>");
    mlIntro.append("<li><b>TensorFlow:</b> Developed by Google for deep learning applications. It’s flexible and can be used for research and production.</li>");
    mlIntro.append("<li><b>Scikit-learn:</b> Simple and efficient tools for data mining and data analysis. Built on NumPy, SciPy, and matplotlib.</li>");
    mlIntro.append("<li><b>PyTorch:</b> Deep learning framework primarily developed by Facebook's AI Research lab. Known for its dynamic computation graph and ease of use.</li>");
    mlIntro.append("<li><b>Keras:</b> High-level neural networks API, written in Python and capable of running on top of TensorFlow, CNTK, or Theano.</li>");
    mlIntro.append("<li><b>XGBoost:</b> Optimized distributed gradient boosting library designed to be highly efficient, flexible, and portable.</li>");
    mlIntro.append("<li><b>LightGBM:</b> Gradient boosting framework that uses tree-based learning algorithms, designed for fast performance and low memory usage.</li>");
    mlIntro.append("</ul>");

    mlIntro.append("<h2>Steps in a Machine Learning Project</h2>");
    mlIntro.append("<ul>");
    mlIntro.append("<li><b>Define the Problem:</b> Clearly state the problem you want to solve.</li>");
    mlIntro.append("<li><b>Collect Data:</b> Gather data relevant to the problem. This could be from various sources including databases, APIs, or web scraping.</li>");
    mlIntro.append("<li><b>Prepare Data:</b> Clean and preprocess the data. This includes handling missing values, normalizing data, and splitting it into training and testing sets.</li>");
    mlIntro.append("<li><b>Select a Model:</b> Choose an appropriate machine learning algorithm based on the problem type (e.g., regression, classification).</li>");
    mlIntro.append("<li><b>Train the Model:</b> Use the training data to train the machine learning model.</li>");
    mlIntro.append("<li><b>Evaluate the Model:</b> Assess the model's performance using the testing data and various metrics like accuracy, precision, recall, and F1 score.</li>");
    mlIntro.append("<li><b>Optimize the Model:</b> Improve the model’s performance by tuning hyperparameters, feature selection, or trying different algorithms.</li>");
    mlIntro.append("<li><b>Deploy the Model:</b> Integrate the trained model into a production environment where it can make predictions on new data.</li>");
    mlIntro.append("</ul>");

    mlIntro.append("<h2>Challenges in Machine Learning</h2>");
    mlIntro.append("<ul>");
    mlIntro.append("<li><b>Data Quality:</b> Poor quality data can lead to poor model performance. Ensuring high-quality data is crucial.</li>");
    mlIntro.append("<li><b>Overfitting:</b> When a model performs well on training data but poorly on new data. Techniques like cross-validation and regularization can help prevent this.</li>");
    mlIntro.append("<li><b>Interpretability:</b> Complex models like deep neural networks can be difficult to interpret and understand.</li>");
    mlIntro.append("<li><b>Scalability:</b> As the volume of data grows, the computational resources required to process it can become significant.</li>");
    mlIntro.append("<li><b>Bias and Fairness:</b> Ensuring models do not reinforce existing biases in data and are fair across different groups.</li>");
    mlIntro.append("</ul>");

    mlIntro.append("<h2>Future of Machine Learning</h2>");
    mlIntro.append("<p>The field of Machine Learning is rapidly evolving with advancements in deep learning, reinforcement learning, and unsupervised learning. Future developments are expected to further enhance the capabilities of AI systems, making them more autonomous, adaptable, and efficient in solving complex problems.</p>");

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
