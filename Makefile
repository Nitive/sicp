# Usage: make c=1 e=1.5 to create files for exercise 1.5 in chapter 1
# It will create source, test and documentation files
exercise:
	dash=$(subst .,-,$(e)); \
	under=$(subst .,_,$(e)); \
	chapter=$${under:0:1}; \
	echo "(ns sicp.chapter-$$chapter.exercise-$$dash)" > \
	"./src/sicp/chapter_$$chapter/exercise_$$under.clj"; \
	echo "(ns sicp.chapter-$$chapter.test-$$dash\n\
	  (:require [clojure.test :refer :all]\n\
	            [sicp.test-helper :refer :all]\n\
	            [sicp.chapter-$$chapter.exercise-$$dash :refer :all]))\n\
	\n\n\
	(deftest test-$$dash\n\
	  (assert-equal 1 2))" > \
	"./test/sicp/chapter_$$chapter/test_$$under.clj"; \
	echo "(ns sicp.chapter-$$chapter.exercise-$$dash)" > \
	"./src/sicp/chapter_$$chapter/exercise_$$under.clj"; \
	echo "### Упражнение ${e}\n\n\
	[Решение](../../src/sicp/chapter_$$chapter/exercise_$$under.clj)\
	 • \
	[Тесты](../../test/sicp/chapter_$$chapter/test_$$under.clj)" > \
	"./doc/chapter_$$chapter/doc_$$under.md"; \

test:
	lein test

watch:
	lein test-refresh

deps:
	lein deps


.PHONY: test watch exercise
