(defproject com.mdrogalis/lib-onyx "0.4.0-SNAPSHOT"
  :description "A library to support additional functionality in Onyx"
  :url "https://github.com/MichaelDrogalis/lib-onyx"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.mdrogalis/onyx "0.4.0-SNAPSHOT"]]
  :profiles {:dev {:dependencies [[midje "1.6.3"]]
                   :plugins [[lein-midje "3.1.1"]]}})