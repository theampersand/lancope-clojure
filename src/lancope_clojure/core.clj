(ns lancope-clojure.core
  (:gen-class)
  (:import (com.lancope GNodeImpl)))

;  Instantiate a Graph and executes the following methods
;
;  1. walkGraph - Returns ArrayList containing every GNode in the graph.
;  each node appears in the ArrayList exactly once.
;  2. paths - return a ArrayList of ArrayLists, representing all
;  possible paths through the graph starting at 'node'. The ArrayList
;  returned can be thought of as a ArrayList of paths, where each path
;  is represented as an ArrayList of GNodes.
; (def graph
;  (new GNodeImpl "node-0" [(new GNodeImpl "node-1")
;                           (new GNodeImpl "node-2" [(new GNodeImpl "node-3" []) (new GNodeImpl "node-4" [])])]))
;      node-0
;       / \
; node-1  node-2
;          / |
;    node-3  node-4

(def graph
  (new GNodeImpl "node-0" [(new GNodeImpl "node-1" [])
                           (new GNodeImpl "node-2" [(new GNodeImpl "node-3" []) (new GNodeImpl "node-4" [])])
                           ]))



(println (.getName (first (rest (.getChildren graph)))))
