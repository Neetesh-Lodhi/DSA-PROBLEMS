class Rectangle{
            public boolean isRectangleCover(int[][] rectangles) {
        long area = 0;
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;

        Set<String> corners = new HashSet<>();

        for (int[] r : rectangles) {
            int x1 = r[0], y1 = r[1];
            int x2 = r[2], y2 = r[3];

            // Update bounding box
            minX = Math.min(minX, x1);
            minY = Math.min(minY, y1);
            maxX = Math.max(maxX, x2);
            maxY = Math.max(maxY, y2);

            // Area sum
            area += (long)(x2 - x1) * (y2 - y1);

            // Corners
            String[] pts = {
                x1 + "," + y1,
                x1 + "," + y2,
                x2 + "," + y1,
                x2 + "," + y2
            };

            for (String p : pts) {
                if (!corners.add(p)) {
                    corners.remove(p);
                }
            }
        }

        // Area check
        long bigArea = (long)(maxX - minX) * (maxY - minY);
        if (area != bigArea) return false;

        // Corner check
        if (corners.size() != 4) return false;

        return corners.contains(minX + "," + minY) &&
               corners.contains(minX + "," + maxY) &&
               corners.contains(maxX + "," + minY) &&
               corners.contains(maxX + "," + maxY);
    }
}