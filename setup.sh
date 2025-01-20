#!/bin/bash

set -e

target_image="yutaronishiyama/riscv-chisel-book:latest"

if [ $(docker images --filter "reference=${target_image}" --format "{{.Repository}}") ]; then
  echo "Docker image ${target_image} already exists."
else
	docker pull ${target_image}
	## docker run --platform linux/amd64 -it -v .:/src yutaronishiyama/riscv-chisel-book
fi