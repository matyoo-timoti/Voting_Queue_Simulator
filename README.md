# Voting_Queue_Simulator
DSA Midterm Group Output | Queue Implementation

Description: 

Voting Queue Simulator is a simple java program that is run on the console. The program is intended as 
a crowd and queue control system. The concept is to sort the objects (persons) and display them in order
on a first-come, first-serve basis. 

The user can specify whether the individual is a priority or a non-priority, and they will be put in to separate
queues. The queues will be dequeued alternatingly. To give an illustration, let's say the user first entered 2 
non-priority individuals followed by 2 priority individuals. 

In this case, the head of priority queue will be dequeued first, followed by the head of the non-priority queue. 
However, if the user enters another entry and it happens to be a priority, it will be placed closest to the head 
of the queue, if not the head. Otherwise, if it is a non-priority, the First Come, First Serve (FCFS) applies.

The program also comes with animations for the title (only shows when you open the program), and an animation while 
displaying the dequeued individual along with succeeding individual (always shows when you dequeue). It also has a 
menu with a few options. The form is composed of fields that requrires a first name, last name, and priority value (y/n).

If the user did not provide a firstname or a lastname, it'll display "N/A", and specifying the priority is crucial.
The program will not proceed with a empty value for priority, the same goes for choosing an option on the menu, and for
yes and no prompts.

There may be certain methods that may not work for your IDE unless you configure it. Like the clearConsole() which 
clears the console screen (the same as the 'cls' command in CMD).

Note: 
• I adjusted some configrations on my IDE (I'm using IntelliJ) to make the console run smoothly.
  I changed IntelliJ IDEA run console flush delay via Help | Edit Custom VM Options by adding this line:
  [ -Dconsole.flush.delay.ms=20 ] // (Do not include the square brackets ([]) and this comment.)
