
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package __TODO___;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 Passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(500,300);
		StringBuilder sb=new StringBuilder();
		sb.append("<html>");
		sb.append("<h1>Formula 1 Passion</h1>");
		sb.append("<div style='display table'>");
        sb.append("<div style='display:table-row'>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("Pilota");
		sb.append("Punteggio");
		
		sb.append("</div>");
        sb.append("<div style='display:table-row'>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("HAMILTON L.");
		sb.append("</div>");
		sb.append("<div style='display:table-cell'>");
		sb.append("358");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("VETTEL S.");
		sb.append("</div>");
		sb.append("<div style='display:table-cell'>");
		sb.append("294");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("RAIKKONEN K.");
		sb.append("</div>");
		sb.append("<div style='display:table-cell'>");
		sb.append("236");
		sb.append("</div>");
		
		
		sb.append("</html>");
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		
		// TODO Creare la stringa HTML per il wireframe
		
		// TODO Convertire lo StringBuilder in String
		
		// TODO Assegnare correttamente la stringa create a JLabel
		String str=sb.toString();
		super.add(new JLabel(str));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

