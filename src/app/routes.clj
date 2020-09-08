(ns app.routes
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))


(defroutes router
  (GET "/" [] "Hello World")
  (route/not-found "Not Found"))
