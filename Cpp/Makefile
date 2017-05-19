# This just a hunch to build the file easily.
DIST=../LoadNative
DIST_NAME=mylib.so
all: build

build:
	@echo "Bundling main.cpp into $(DIST_NAME)"
	@g++ -fPIC main.cpp -shared -o $(DIST_NAME)
	@echo "Bundling finished. Now copy to dist folder..."
	@cp $(DIST_NAME) $(DIST)/$(DIST_NAME)
	@rm $(DIST_NAME)
	@echo "Finished"

	