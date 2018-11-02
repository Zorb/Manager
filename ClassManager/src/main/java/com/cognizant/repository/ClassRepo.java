package com.cognizant.repository;

public interface ClassRepo {

	String getAllClasses();

	String createClass(String classroom);

	String updateClass(Long id, String classToUpdate);

	String deleteClass(Long id);

}