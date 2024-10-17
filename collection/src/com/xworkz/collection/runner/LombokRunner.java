package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import com.xworkz.collection.dto.EmailDTO;

public class LombokRunner {

	public static void main(String[] args) {
		
        Collection<EmailDTO> emailList = new ArrayList<EmailDTO>();
        emailList.add(new EmailDTO("sanjeevini@gmail.com", "nikhita@gmail.com", "Hello", "Hi nikhita"));
        emailList.add(new EmailDTO("sneha@gmail.com", "bharati@gmail.com", "Meeting", "Let's meet tomorrow."));
        emailList.add(new EmailDTO("niha@gmail.com", "sindhu@gmail.com", "Project Update", "Here are the updates."));
        emailList.add(new EmailDTO("aarati@gmail.com", "poorna@gmail.com", "Party Invitation", "You're invited!"));
        emailList.add(new EmailDTO("amruta@gmail.com", "varsha@gmail.com", "Feedback", "Please provide your feedback."));

        // 1. add
        emailList.add(new EmailDTO("kiran@gmail.com", "krishav@gmail.com", "Question", "I have a question."));

        // 2. addAll
        Collection<EmailDTO> additionalEmails = List.of(
                new EmailDTO("samantha@gmail.com", "kriti@gmail.com", "Dinner Plans", "Are we still on for dinner?"),
                new EmailDTO("ananya@gmail.com", "tanaya@gmail.com", "Vacation", "Planning a vacation!")
        );
        emailList.addAll(additionalEmails);
        
        // 3. contains
        System.out.println("Contains 'ashwini@gmail.com': " + emailList.contains(new EmailDTO("sanjeevini@gmail.com", "nikhita@gmail.com", "Hello", "Hi Bob!")));

        // 4. containsAll
        System.out.println("Contains all additional emails: " + emailList.containsAll(emailList));

        // 5. equals
        System.out.println("Equals an empty list: " + emailList.equals(new ArrayList<>()));

        // 6. isEmpty
        System.out.println("Is the collection empty? " + emailList.isEmpty());

        // 7. hashCode
        System.out.println("HashCode of the collection: " + emailList.hashCode());

        // 8. remove
        emailList.remove(new EmailDTO("amruta@gmail.com", "varsha@gmail.com", "Feedback", "Please provide your feedback"));
        System.out.println("After removal: " + emailList);

        // 9. iterator
        Iterator<EmailDTO> iterator = emailList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterating: " + iterator.next());
        }

        // 10. removeAll
        emailList.removeAll(emailList);
        System.out.println("After removing additional emails: " + emailList);

        // 11. size
        System.out.println("Size of the collection: " + emailList.size());


        // 12. retainAll
       		        emailList.retainAll(List.of(new EmailDTO("carol@gmail.com", "megha@gmail.com", "Meeting", "Let's meet tomorrow.")));
       		        System.out.println("After retaining a specific email: " + emailList);
       				
        // 13. removeIf
        emailList.removeIf(email -> email.getFrom().startsWith("c"));
        System.out.println("After removing emails from 'c': " + emailList);

        // 14. stream
        Stream<EmailDTO> emailStream = emailList.stream();
        emailStream.forEach(email -> System.out.println("Streaming: " + email));
    }

}




	 
