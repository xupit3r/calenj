(ns calenj.routes
  (:require [compojure.route :refer [not-found]]
            [compojure.core :refer [defroutes GET]]
            [cheshire.core :as json]))

(defn rjson [status body]
  {:status status
   :headers {"Content-Type" "application/json"}
   :body (json/encode body)})

(defn root [_req] 
  (rjson 
    200 
    {:available ["/"]}))

(defroutes all 
  (GET "/" [] root)
  (not-found (rjson 404 {:greeting "🖕"})))
