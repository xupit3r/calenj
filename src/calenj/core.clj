(ns calenj.core
  (:gen-class)
  (:require [calenj.routes :as routes]
            [org.httpkit.server :as http]))

(defn -main [& _args]
  (http/run-server routes/all {:port 8080}))
