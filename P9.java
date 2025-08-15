public static List<String> findPath(Map<String, List<String>> graph, String start, String end) {
        
        if (!graph.containsKey(start) || !graph.containsKey(end)) {// If either start or end are not exist, then no path
            return Collections.emptyList();
        }

        Queue<List<String>> queue = new LinkedList<>();//stores path
        Set<String> visited = new HashSet<>();

        queue.add(Arrays.asList(start));

        while (!queue.isEmpty()) {
            List<String> path = queue.poll();
            String lastNode = path.get(path.size() - 1);

            if (lastNode.equals(end)) {//return path when end node found
                return path;
            }

            if (!visited.contains(lastNode)) {
                visited.add(lastNode);

                for (String neighbor : graph.getOrDefault(lastNode, new ArrayList<>())) {// Add neighbors to queue
                    if (!visited.contains(neighbor)) {
                        List<String> newPath = new ArrayList<>(path);
                        newPath.add(neighbor);
                        queue.add(newPath);
                    }
                }
            }
        }

        return Collections.emptyList();// No path found
    }

    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();//build graph
        graph.put("A", Arrays.asList("B"));
        graph.put("B", Arrays.asList("A", "C", "D", "E"));
        graph.put("C", Arrays.asList("F"));
        graph.put("D", Arrays.asList("G", "E"));
        graph.put("E", Arrays.asList("F"));
        graph.put("F", Arrays.asList("B", "G"));
        graph.put("G", Arrays.asList());
        graph.put("H", Arrays.asList()); 

        List<String> path1 = findPath(graph, "D", "B");
        System.out.println("D -> B: " + (!path1.isEmpty()) + " " + path1);

        List<String> path2 = findPath(graph, "F", "A");
        System.out.println("F -> A: " + (!path2.isEmpty()) + " " + path2);

        List<String> path3 = findPath(graph, "G", "C");
        System.out.println("G -> C: " + (!path3.isEmpty()) + " " + path3);

        List<String> path4 = findPath(graph, "E", "D");
        System.out.println("E -> D: " + (!path4.isEmpty()) + " " + path4);
    }
   
