package Interface;

	public abstract class Businessman extends Person implements Richman, SocialWorker{
		private int id;
		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id=id;
		}

		public void helpToOthers() {
			System.out.println("help!!!");
			
		}

		@Override
		public void earnMoney() {
			System.out.println("earned Money");
			
		}

		@Override
		public void donation() {
			System.out.println("donation");
			
		}

		@Override
		public void party() {
			System.out.println("party it is");
			
		}
		
	    
	}

