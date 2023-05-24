(defproject calenj "0.1.0"
  :description "an application/service to collect events from Google Calendar"
  :url "https://thejoeshow.net"
  :license {:name "EPL-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [http-kit "2.3.0"]
                 [compojure "1.7.0"]
                 [cheshire "5.11.0"]
                 [environ "1.2.0"]]
  :plugins [[lein-environ "1.2.0"]]
  :main ^:skip-aot calenj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
