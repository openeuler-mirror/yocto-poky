# executed only once
if [ ! -f $OECORE_NATIVE_SYSROOT/flag ];then
    touch $OECORE_NATIVE_SYSROOT/flag

    # adapt to openEuler-Embedded build
    mv $OECORE_NATIVE_SYSROOT/usr/bin/meson $OECORE_NATIVE_SYSROOT/usr/bin/meson.bak
    mv $OECORE_NATIVE_SYSROOT/usr/bin/meson.real $OECORE_NATIVE_SYSROOT/usr/bin/meson
    ln -s $OECORE_NATIVE_SYSROOT/usr/bin/python3 $OECORE_NATIVE_SYSROOT/usr/bin/python
    ln -s $OECORE_NATIVE_SYSROOT/usr/bin/x86_64-pokysdk-linux-libtool $OECORE_NATIVE_SYSROOT/usr/bin/libtool
    sed -i 's|/../lib/rpm|/../../lib/rpm|g' $OECORE_NATIVE_SYSROOT/usr/lib/rpm/rpmdeps
fi