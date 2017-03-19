package com.agni.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class pointsOnLine {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// String line = br.readLine();
		int rows = Integer.parseInt(br.readLine());
		int column = Integer.parseInt(br.readLine());
		int plantsD = Integer.parseInt(br.readLine());
		String line = br.readLine();
		int i, j = 0;
		String[] positions = line.replace('(', ' ').replace(')', ' ')
				.split(",");
		List<String> points = new ArrayList<String>();
		for (i = 0; i < positions.length; i += 2) {
			points.add(positions[i].trim() + "," + positions[i + 1].trim());
		}
		SortedSet<Integer> length = new TreeSet<Integer>();
		for (i = 0; i < points.size(); i++) {
			for (j = 1; j < points.size(); j++) {
				length.add(getPosition(points, points.get(i), points.get(j)));

			}
		}
		System.out.println(length.last());
	}

	public static int getPosition(List<String> positions, String first,
			String second) {
		int count = 2;
		int x1 = Integer.parseInt(first.split(",")[0]);
		int y1 = Integer.parseInt(first.split(",")[1]);

		int x2 = Integer.parseInt(second.split(",")[0]);
		int y2 = Integer.parseInt(second.split(",")[1]);
		System.out.println("positions" + first + "---" + second);

		for (int i = 0; i < positions.size(); ++i) {
			// skip
			int xi = Integer.parseInt(positions.get(i).split(",")[0].trim());
			int yi = Integer.parseInt(positions.get(i).split(",")[1].trim());

			if (!(xi == x1 && y1 == y1) || !(x2 == xi && y2 == yi)) {
				if (x1 == x2)
					if (xi != x1)
						continue;

				if (!((y1 - y2) * (xi - x2) == (yi - y2) * (x1 - x2)))
					continue;

				if (!((y2 * x1 - y1 * x2) * (xi - x2) == (y2 * xi - yi * x2)
						* (x1 - x2)))
					continue;

				count++;
			}

		}
		return count;

	}

}
