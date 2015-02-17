package test.ravi.edu;

import java.util.*;

public class ExampleEnhancedFor implements Iterable<ExampleEnhancedFor.Penguin> {

	  static class Penguin {
	    String name;
	    Penguin(String name) {
	      this.name = name;
	    }
	    public String toString() {
	      return "Penguin{" + name + "}";
	    }
	  }

	  Set<Penguin> set = new HashSet<Penguin>();

	  public void addPenguin(Penguin p) {
	    set.add(p);
	  }

	  public Iterator<Penguin> getPenguins() {
	    return set.iterator();
	  }

	  public Iterator<Penguin> iterator() {
	    return getPenguins();
	  }

	  public static void main(String args[]) {
		//example  
		ExampleEnhancedFor colony = new ExampleEnhancedFor();
	    Penguin opus = new Penguin("Opus");
	    Penguin chilly = new Penguin("Chilly Willy");
	    Penguin mumble = new Penguin("Mumble");
	    Penguin emperor = new Penguin("Emperor");
	    colony.addPenguin(opus);
	    colony.addPenguin(chilly);
	    colony.addPenguin(mumble);
	    colony.addPenguin(emperor);
    
	    for (Penguin p : colony) {   	
	      System.out.println(p);	      
	    }
	    
	    
	    // another example
	    String languages[] = { "C", "C++", "Java", "Python", "Ruby"};
		 
	    for (String sample: languages) {
	      System.out.println(sample);
	    }
	  }
	  
	  

	  
	  
	}