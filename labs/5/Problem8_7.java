
public class Problem8_7 {
	/** Main method */
	public static void main(String[] args) {

		// Initializing array with points
		double[][] points = {{-1, 1, 4}, {2, 0, -1}, {5, 1, 1},                      
			{2, 1, 9}, {6.5, 2, -1}, {4, 3, 3}, {-1.5, 5, 3},                          
			{6.5, 4, -1}};

		// p1 and p2 are the indices in the points' array
		int p1 = 0, p2 = 1, p3 = 3; // Initial two points
		double shortestDistance = distance(points[p1][0], points[p1][1], points[p1][2],
			points[p2][0], points[p2][p1], points[p3][p2]); // Initialize shortest Distance

		// To find distance for every two points
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1], points[i][2],
					points[j][0], points[j][1], points[j][2]); // Find distance

				if (shortestDistance > distance) {
					p1 = i; // Update p1
					p2 = j; // Update p2
					shortestDistance = distance; // Update shortestDistance
				}
			}
		}

		// Display result
		System.out.println("The nearest two points are " +
			"(" + points[p1][0] + ", " + points[p1][1] + ") and (" +
				points[p2][0] + ", " + points[p2][1] + ")");
	}

	/** To find the distance between two points (a1, b1) and (a2, b2)*/
	public static double distance(
		double a1, double b1, double c1, double a2, double b2, double c2) {
		return Math.sqrt(Math.pow(a2 - a1, 2) +  
			Math.pow(b2 - b1, 2) + Math.pow(b2 - b1, 2));
	}
}


