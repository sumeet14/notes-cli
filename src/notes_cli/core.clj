(ns notes-cli.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;;;; A basic CLI notes app
;;
;; 1. create a note
;; 2. read a note
;; 3. get list of notes
;; 4. update a note
;; 5. delete a note
;;
;; 1. store in a hash map
;; 2. store in a JSON file
;; 3. DB - ?

(comment
  ;; sample notes JSON

  ;; {
  ;;   "notes": [
  ;;       {
  ;;           "title": "note title",
  ;;           "text": "note text",
  ;;           "dateCreated": "date created",
  ;;           "date updated": "date updated"
  ;;       },
  ;;       {
  ;;           "titile": "note title",
  ;;           "text": "note text",
  ;;           "dateCreated": "date created",
  ;;           "date updated": "date updated"
  ;;       }
  ;;   ]
  ;; }
  )