(ns antq.constant
  (:require
   [antq.util.env :as u.env]))

(def retry-limit
  "Retry count for
   - antq.util.maven/read-pom
   - antq.util.git/ls-remote*"
  5)

(def clojure-deps-keys
  "Keys for detecting dependencies in deps.edn"
  #{:deps :default-deps :extra-deps :override-deps :replace-deps})

(def default-timeout-msec
  (u.env/getlong "ANTQ_TIMEOUT" 5000))

(def ls-remote-timeout-msec
  "Timeout msec for
   - antq.util.git/ls-remote*"
  (u.env/getlong "ANTQ_LS_REMOTE_TIMEOUT" default-timeout-msec))

(def github-api-timeout-msec
  "Timeout msec for
   - antq.ver.github-tag/get-sorted-versions-by-ls-remote*"
  (u.env/getlong "ANTQ_GITHUB_API_TIMEOUT" default-timeout-msec))

(def maven-timeout-msec
  "Timeout msec for
   - antq.ver.java/get-versions"
  (u.env/getlong "ANTQ_MAVEN_TIMEOUT" default-timeout-msec))

(def pom-timeout-msec
  "Timeout msec for
   - antq.util.maven/read-pom*"
  (u.env/getlong "ANTQ_POM_TIMEOUT" default-timeout-msec))
