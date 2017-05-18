(ns command-line-args.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn parse-args [args]
  ;; Constructs a `hash-map` from `args`. (`args` must contain an even number of forms.)
  (into {} (map (fn [[k v]] [(keyword (.replace k "--" "")) v]) (partition 2 args))))
