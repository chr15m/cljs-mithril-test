SRC=$(shell find ./ -name '*.cljs')

build/index.html: build/.artifact.html build
	html-minifier --minify-css --collapse-whitespace < $< > $@

build/.artifact.html: src/index.template.html build/js/app.js public/css/site.css public/css/loader.css
	gpp -H $< > $@

build/js/app.js: $(SRC)
	mkdir -p build
	lein package

build:
	mkdir -p build

.PHONY: clean

clean:
	lein clean
	rm -rf build/*

