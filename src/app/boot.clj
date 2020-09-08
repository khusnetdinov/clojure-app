(ns app.boot
  (:require [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.logger :as logger]
            [app.routes :as routes]))


(def main
  (logger/wrap-with-logger
   (wrap-defaults routes/router site-defaults)))
