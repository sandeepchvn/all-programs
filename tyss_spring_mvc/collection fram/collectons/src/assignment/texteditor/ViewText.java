package assignment.texteditor;

public class ViewText {
	public static void main(String[] args) {
		TextController tc = new TextController();
		System.out.println("welcom to text editor");
		while (true) {
			System.out.println("1. save");
			System.out.println("2. undo");
			System.out.println("3. redo");
			System.out.println("4. display");
			System.out.println("5. add to dictionary");
			System.out.println("6. autosuggest");
			System.out.println("7. exit");
			System.out.println("enter your choice: ");
			
			int c=tc.read.nextInt();
			tc.read.nextLine();
			
			switch (c) {
			case 1:
				tc.saveText();
				break;
			case 2:
				tc.undo();
				break;
			case 3:
				tc.redo();
				break;
			case 4:
				tc.display();
				break;
			case 7:
				return;
			case 5:
				tc.addWordsToDictionary();
				break;
			case 6:
				tc.autoSuggest();
				break;
			default:
				System.out.println("enter the valid choice");

			}
		}
	}
}
