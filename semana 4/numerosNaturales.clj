(defn zero [f] (fn [x] x))

(defn one [f] (fn [x] (f x)))

(defn two [f] (fn [x] (f(f x))))

(defn three [f] (fn [x] (f(f(f x)))))

(defn succ [n] (fn [f] (fn [x] (f ((n f) x)))))

(defn add [n] (fn [m] (fn [f] (fn [x] ((n f) ((m f) x))))))

(defn mult [n] (fn [m] (fn [f] (fn [x] ((n (m f)) x)))))

