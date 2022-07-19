package sorting;

import java.util.ArrayList;
import java.util.Collections;

//Driver class
class Main
{
	public static void main(String[] args)
	{	//calling comparable
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));

		Collections.sort(list);

		System.out.println("Movies after comprable sorting : ");
		for (Movie movie: list)
		{
			System.out.println(movie.getName() + " " +
							movie.getRating() + " " +
							movie.getYear());
		}
		
		
		//calling comparator
		ArrayList<Movie> movieList = new ArrayList<Movie>();
        movieList.add(new Movie("Force Awakens", 8.3, 2015));
        movieList.add(new Movie("Star Wars", 8.7, 1977));
        movieList.add(new Movie("Empire Strikes Back", 8.8, 1980));
        movieList.add(new Movie("Return of the Jedi", 8.4, 1983));
 
        // Sort by rating : (1) Create an object of ratingCompare
        //                  (2) Call Collections.sort
        //                  (3) Print Sorted list
        System.out.println("\nSorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(movieList, ratingCompare);
        for (Movie movie: movieList)
            System.out.println(movie.getRating() + " " +
                               movie.getName() + " " +
                               movie.getYear());
 
 
        // Call overloaded sort method with RatingCompare
        // (Same three steps as above)
        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(movieList, nameCompare);
        for (Movie movie: movieList)
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
 
        // Uses Comparable to sort by year
        System.out.println("\nSorted by year");
        Collections.sort(movieList);
        for (Movie movie: movieList)
            System.out.println(movie.getYear() + " " +
                               movie.getRating() + " " +
                               movie.getName()+" ");
		
	}
}