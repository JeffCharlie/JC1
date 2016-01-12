package com.jc1.hooli.cafe;

import java.util.ArrayList;
import java.util.List;

public class DataManager {

    private static List<Course> data = new ArrayList<>();

    public static List<Course> getData() {
        return data;
    }

    static {

        data.add(new Course(10101, "Middle Out Pops", "Experience lollipops in a hooli new way- the middle on the outside!", 7));

        data.add(new Course(10102, "Tres Commas Tacos", "Dont settle for just uno or dos - people like you need tres commas tacos!", 6));

        data.add(new Course(10103, "Yogurt with Spoon", "Yes, the yogurt is fine, but with this spoon, you'll never miss a dollop of yogurt again.  The corners of your container will never be cleaner!", 8));

        data.add(new Course(10104, "Compressed PBJ", "An old classic brought up to date with extreme compression - our best selling item, compressed PBJ, is exactly what it sounds like.  We make the sandwiches fresh everyday and then manually compress with our hands moments before they get to your house.", 6));

        data.add(new Course(20101, "Big Head Spighetti", "Normal spaghetti just dont cut it here at Hooli Cafe - we are revolutionizing pasta from the group up and our flagship dish will have your head spinning for years to come.", 11));

        data.add(new Course(20102, "The Nucleus", "Take a normal grilled cheese sandwich, add finely sliced eggplant, and you've just made a nucleus.  Dont knock it til you try it!", 7));

        data.add(new Course(20103, "Gilfoyle's Nacho Supreme", "Heard of it?  Do you have any idea how those chips get covered with just the right amount of cheese and meat and peppers?  Its not magic - its talent and sweat.  Its people like us ensuring your nachos get delivered unsniffed (sometimes)", 10));

        data.add(new Course(30101, "Dinesh's Meixcan Pizza", "Dont be offended, but this is not actually Mexican pizza - its French onion soup with croutons.  You wanted stock options until you saw Dinesh's Mexican pizza - no amount of money can replace the deliciousness of what you're about to eat!", 9));

        data.add(new Course(30102, "Jared's Kale Juice", "Smooth and green and tastes disgusting, but we'll charge you nonetheless cause its Kale", 7));

        data.add(new Course(30103, "Condor Egg - unhatched", "A rare delicacy only found in certain parts of the world - these condor eggs have been flown in from their natural habitats from san diego", 8));

        data.add(new Course(30104, "Bachman's Aviatoast", "Browned, not blacked, bread - perfect way to start the day!  Its also the perfect way to end the day, we might add.", 9));

    }
}
