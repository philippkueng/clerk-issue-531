(ns issue_reproduction
  (:require [libpython-clj2.require :refer [require-python]]
            [libpython-clj2.python :refer [py. py.. py.- get-attr call-attr] :as py]))

; have to set the headless mode before requiring pyplot
(def mplt (py/import-module "matplotlib"))
(py. mplt "use" "Agg")

(require-python '[matplotlib.pyplot :as pyplot :bind-ns true])

;; Fails with error: Invalid symbol: Note:.
;; which sounds like https://github.com/nextjournal/clerk/issues/531 -> Invalid symbol: BagObj:
; (matplotlib.pyplot/imread "images/2024_08_20_room_light.jpg")
