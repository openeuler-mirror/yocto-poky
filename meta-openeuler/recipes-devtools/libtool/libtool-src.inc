PV = "2.4.7"

DL_DIR = "${OPENEULER_SP_DIR}/${BPN}"
FILESEXTRAPATHS_prepend = "${OPENEULER_SP_DIR}/${BPN}:"

# add patches from new poky under meta-openeluer
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_remove = "${GNU_MIRROR}/libtool/libtool-${PV}.tar.gz \
           file://unwind-opt-parsing.patch \
"

# apply openeuler source package and patches
SRC_URI_prepend = "file://${BP}.tar.xz \
           file://libtool-2.4.5-rpath.patch \
"
