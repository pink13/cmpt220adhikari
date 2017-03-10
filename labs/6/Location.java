
public class Location {
	int row;       
	int column;	
	double maxValue;

	// Constructs a default Loction object /
	Location(double[][] a) {
		maxValue = a[0][0];
		row = 0;
		column = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
	}
}

