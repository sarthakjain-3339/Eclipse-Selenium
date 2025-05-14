package Pattern;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class Tringle_0_1 {
	/*
	 * pattern: Triangle 0-1
	1
	01
	101
	0101
	10101
	*/
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				int sum = i + j;
				if (sum % 2 == 0) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}

			}
			System.out.println();
		}
	}
}
