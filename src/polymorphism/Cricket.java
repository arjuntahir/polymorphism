package polymorphism;



	
		// TODO Auto-generated method stub
		class Sachin {
			   public void displayInfo() {
			      System.out.println("I am sachin.");
			   }
			}

			class Virat extends Sachin {
			   @Override
			   public void displayInfo() {
			      System.out.println("I am virat.");
			   }
			}
			class Cricket {
				   public static void main(String[] args) {
				      Virat d1 = new Virat();
				      d1.displayInfo();
				   }
				}
			
// method overridnig