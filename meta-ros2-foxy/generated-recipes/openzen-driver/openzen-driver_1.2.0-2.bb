# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "ROS 2 Driver for LP-Research inertial measurement units and satellite navigation senors"
AUTHOR = "Thomas Hauth <thomas@lp-research.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "MIT & Boost Software License & LGPLv3 & BSD"
LICENSE = "MIT & BSL-1.0 & LGPL-3.0-only & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=17aa8a6fb4ebd2ec377bc14aaa9ab8d7"

ROS_CN = "openzen_driver"
ROS_BPN = "openzen_driver"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
    rqt-plot \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    launch \
    launch-testing \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/lp-research/openzen_sensor_ros2-release/archive/release/foxy/openzen_driver/1.2.0-2.tar.gz
ROS_BRANCH ?= "branch=release/foxy/openzen_driver"
SRC_URI = "git://github.com/lp-research/openzen_sensor_ros2-release;${ROS_BRANCH};protocol=https"
SRCREV = "82d6f0846507525cdfefbb4ddb8955da91c69ad7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}