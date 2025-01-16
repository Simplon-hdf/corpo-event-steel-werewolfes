package com.yferdin.corpo_event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class EventController{
	
@Autowired	
private EventRepository eventRepository;

@Autowired
private LocationRepository locationRepository;

@Autowired
private UserRepository userRepository;

@GetMapping("/event/new")
public String displayEventForm(Model model) {
	model.addAttribute("event", new Event());
	return "newEvent";
}

@PostMapping("/event/new")
public String persistEvent(@ModelAttribute Event event, HttpServletRequest request) {
	String mail = request.getSession().getAttribute("userMail").toString();
	User user = userRepository.findByEmail(mail);
	event.setUser(user);
	Location location = event.getLocation();
	Location checkDb = locationRepository.findByLocationName(location.getLocationName());
	if(checkDb == null) {
		locationRepository.save(location);
	}
	eventRepository.save(event);
	return "newEvent";
}
}
