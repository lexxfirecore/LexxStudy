package com.lexxstudy.inheritance;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Interfaces {
	
	public interface Guitar{
		String sound();
	}
	
	public class ElectricGuitar implements Guitar{
		public String sound(){
			return "crunch";
		}
	}
	
	public class WesternGuitar implements Guitar{
		public String sound(){
			return "strumm";
		}
	}
	
	public class ClassicalGuitar implements Guitar{
		public String sound(){
			return "arpegio";
		}
	}
		
	public class Play{
		public String sweep()
		{
			List<Guitar> ls = new Vector<Guitar>();
			StringBuilder sb = new StringBuilder();
			ls.add(new ElectricGuitar());
			ls.add(new WesternGuitar());
			ls.add(new ClassicalGuitar());
			ls.add(new ElectricGuitar());
			ls.add(new WesternGuitar());
			ls.add(new ClassicalGuitar());
			ls.add(new WesternGuitar());
			ls.add(new ClassicalGuitar());
			ls.add(new WesternGuitar());
			
			for(Guitar g: ls)
			{
				sb.append(g.sound()+ " ");
			}
			return (String) sb.toString();
		}
	}
		
	public static void main(String[] args) {
		Interfaces inst = new Interfaces();
		Play p = inst.new Play();
		System.out.println(p.sweep());
	}

}
